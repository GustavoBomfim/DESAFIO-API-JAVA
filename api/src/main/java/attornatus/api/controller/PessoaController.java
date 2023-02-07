package attornatus.api.controller;


import attornatus.api.pessoa.DadosCadastroPessoa;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("pessoas")
public class PessoaController {
    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroPessoa dadosCadastroPessoa){
        System.out.println(dadosCadastroPessoa);
    }
}
