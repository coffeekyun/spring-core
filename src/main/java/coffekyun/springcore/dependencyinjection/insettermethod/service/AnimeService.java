package coffekyun.springcore.dependencyinjection.insettermethod.service;

import coffekyun.springcore.dependencyinjection.insettermethod.repository.AnimeRepository;
import coffekyun.springcore.dependencyinjection.insettermethod.repository.UserRepository;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AnimeService {
    // dependency injection in setter bisa kita lakukan denagn menmbahkan @AutoWire di, setter method
    // kita bisa mengkombinasikan setter dependency injection dengan constructor dependency injection

    @Getter // helper doang jangan pedulikan, yang penting @AutoWired
    private AnimeRepository animeRepository;
    @Getter
    private UserRepository userRepository;

    @Autowired // harus mendefinisikan @AutoWired agar bisa di inject secara langsung, boleh lebih dari satu , tidak seperti di di constructor
    public void setAnimeService(AnimeRepository animeRepository, UserRepository userRepository) {
        this.animeRepository = animeRepository;
        this.userRepository = userRepository;
    }
}
