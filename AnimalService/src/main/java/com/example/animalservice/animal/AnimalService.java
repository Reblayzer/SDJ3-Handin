package com.example.animalservice.animal;


import com.example.animalservice.origin.OriginRepo;
import io.grpc.stub.StreamObserver;
import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.server.service.GrpcService;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@GrpcService
@RequiredArgsConstructor
public class AnimalService extends AnimalServiceGrpc.AnimalServiceImplBase {

    private final OriginRepo originRepo;
    private final AnimalRepo animalRepo;


    @Override
    public void getAnimal(AnimalOuterClass.GetAnimalRequest request, StreamObserver<AnimalOuterClass.Animal> responseObserver) {
        animalRepo.findById(request.getId()).ifPresent(
                animal -> responseObserver.onNext(convertAnimalToProto(animal))
        );
        responseObserver.onCompleted();
    }

    @Override
    public void getAnimals(AnimalOuterClass.Empty request, StreamObserver<AnimalOuterClass.AnimalList> responseObserver) {
        AnimalOuterClass.AnimalList.Builder builder =AnimalOuterClass.AnimalList.newBuilder();
        animalRepo.findAll().forEach(animal -> builder.addAnimals(convertAnimalToProto(animal)));
        responseObserver.onNext(builder.build());
        responseObserver.onCompleted();
    }

    @Override
    public void getAnimalsByOrigin(AnimalOuterClass.GetAnimalsByOriginRequest request,
                                   StreamObserver<AnimalOuterClass.AnimalList> responseObserver) {
        AnimalOuterClass.AnimalList.Builder animalList = AnimalOuterClass.AnimalList.newBuilder();
        animalRepo.findAllByOriginId(request.getId()).forEach(animal ->
                animalList.addAnimals(convertAnimalToProto(animal)));
        responseObserver.onNext(animalList.build());
        responseObserver.onCompleted();
    }

    @Override
    public void createAnimal(AnimalOuterClass.AnimalCreate request, StreamObserver<AnimalOuterClass.Animal> responseObserver) {
        System.out.println("createAnimal");
        Animal animal = animalRepo.save(convertProtoToAnimal(request));
        responseObserver.onNext(convertAnimalToProto(animal));
        responseObserver.onCompleted();
    }

    @Override
    public void getAnimalsByDate(AnimalOuterClass.Date request, StreamObserver<AnimalOuterClass.AnimalList> responseObserver) {
        AnimalOuterClass.AnimalList.Builder animalList = AnimalOuterClass.AnimalList.newBuilder();
        LocalDate date = LocalDate.of(request.getYearOfRegistration(), request.getMonthOfRegistration(),
                request.getDateOfRegistration());
        animalRepo.findAllByDateOfRegister(date).forEach(animal ->
                animalList.addAnimals(convertAnimalToProto(animal)));
        responseObserver.onNext(animalList.build());
        responseObserver.onCompleted();
    }

    private AnimalOuterClass.Animal convertAnimalToProto(Animal animal) {
        return AnimalOuterClass.Animal.newBuilder()
                .setId(animal.getRegistrationNumber())
                .setDateOfRegistration(animal.getDateOfRegister().getDayOfMonth())
                .setMonthOfRegistration(animal.getDateOfRegister().getMonthValue())
                .setYearOfRegistration(animal.getDateOfRegister().getYear())
                .setOriginId(animal.getOrigin().getId())
                .setWeight(animal.getWeight())
                .build();
    }

    private Animal convertProtoToAnimal(AnimalOuterClass.AnimalCreate animalProto){
        Animal animal = new Animal();
        originRepo.findById(1L).ifPresent(animal::setOrigin);
        animal.setWeight((float) animalProto.getWeight());
        LocalDate date = LocalDate.of(animalProto.getYearOfRegistration(), animalProto.getMonthOfRegistration(), animalProto.getDateOfRegistration());
        animal.setDateOfRegister(date);
        return animal;
    }


}
