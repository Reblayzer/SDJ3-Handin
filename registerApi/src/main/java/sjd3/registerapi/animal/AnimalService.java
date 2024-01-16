package sjd3.registerapi.animal;


import lombok.RequiredArgsConstructor;
import net.devh.boot.grpc.client.inject.GrpcClient;
import org.springframework.stereotype.Service;
import sjd3.registerapi.animal.Dtos.AnimalGetDTO;
import sjd3.registerapi.animal.Dtos.AnimalRegisterDTO;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Collections;

@Service
@RequiredArgsConstructor
public class AnimalService {

    @GrpcClient("animal-service-grpc")
    private AnimalServiceGrpc.AnimalServiceBlockingStub stub;


    public void register(AnimalRegisterDTO dto) {
        LocalDate date = LocalDate.now();
        stub.createAnimal(AnimalOuterClass.AnimalCreate.newBuilder()
                .setDateOfRegistration(date.getDayOfMonth())
                .setMonthOfRegistration(date.getMonthValue())
                .setYearOfRegistration(date.getYear())
                        .setWeight(dto.getWeight())
                .build());
    }

    public Collection<AnimalGetDTO> getAllAnimalsByOrigin(Long originId) {
        AnimalOuterClass.AnimalList animals = stub.getAnimalsByOrigin(AnimalOuterClass.GetAnimalsByOriginRequest.newBuilder()
                .setId(originId)
                .build());
        return animals.getAnimalsList().stream().map(animal -> new AnimalGetDTO(
                (float) animal.getWeight(),
                animal.getId(),
                LocalDate.of(animal.getYearOfRegistration(), animal.getMonthOfRegistration(), animal.getDateOfRegistration())
        )).toList();
    }

    public Collection<AnimalGetDTO> getAllAnimalsByRegisterDate(LocalDate localDate) {
        AnimalOuterClass.AnimalList animals = stub.getAnimalsByDate(AnimalOuterClass.Date.newBuilder()
                .setDateOfRegistration(localDate.getDayOfMonth())
                .setMonthOfRegistration(localDate.getMonthValue())
                .setYearOfRegistration(localDate.getYear())
                .build());
        return animals.getAnimalsList().stream().map(animal -> new AnimalGetDTO(
                (float) animal.getWeight(),
                animal.getId(),
                LocalDate.of(animal.getYearOfRegistration(), animal.getMonthOfRegistration(), animal.getDateOfRegistration())
        )).toList();
    }

    public Collection<AnimalGetDTO> getAllAnimals() {
        AnimalOuterClass.AnimalList animals = stub.getAnimals(AnimalOuterClass.Empty.newBuilder().build());
        return animals.getAnimalsList().stream().map(animal -> new AnimalGetDTO(
                (float) animal.getWeight(),
                animal.getId(),
                LocalDate.of(animal.getYearOfRegistration(), animal.getMonthOfRegistration(), animal.getDateOfRegistration())
        )).toList();
    }

    public AnimalGetDTO getAnimalById(long id){
        AnimalOuterClass.Animal animal = stub.getAnimal(AnimalOuterClass.GetAnimalRequest.newBuilder()
                .setId(id)
                .build());
        return new AnimalGetDTO(
                (float) animal.getWeight(),
                animal.getId(),
                LocalDate.of(animal.getYearOfRegistration(), animal.getMonthOfRegistration(), animal.getDateOfRegistration())
        );
    }
}
