package attornatus.api.pessoa;

import attornatus.api.endereco.DadosEndereco;

public record DadosCadastroPessoa(
        String nome,
        String dataDeNascimento,
        DadosEndereco endereco
        ) {
}
