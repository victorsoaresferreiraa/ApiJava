package api.ApiJava.medico;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DadosEndereco(
        @NotBlank
        String logradouro,
        @NotBlank
        String bairro,
        @NotBlank
        @Pattern(regexp = "\\d{4,6}")
        String cep,
        @NotNull
        String cidade,
        @NotNull
        String uf,
        @NotNull
        String complemento,
        @NotNullg
        String numero) {
}