package oslomet.musteri;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
public class MusteriController {

    private final List<Musteri> tumMusteriler=new ArrayList<>();
    @PostMapping("/kayit")
    public void musteriKayit(Musteri girMusteri){
        tumMusteriler.add(girMusteri);
    }

    @GetMapping("/hepsiniGetir")
    public List<Musteri> hepsiniGetir(){
        return tumMusteriler;
    }

}
