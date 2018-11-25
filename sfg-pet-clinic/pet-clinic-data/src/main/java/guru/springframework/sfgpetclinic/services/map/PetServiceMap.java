package guru.springframework.sfgpetclinic.services.map;

import guru.springframework.sfgpetclinic.models.Pet;
import guru.springframework.sfgpetclinic.services.CrudService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CrudService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long aLong) {
        return super.findById(aLong);
    }

    @Override
    public Pet save(Long aLong, Pet pet) {
        return super.save(aLong, pet);
    }

    @Override
    public void deleteById(Long aLong) {
        super.deleteById(aLong);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }
}
