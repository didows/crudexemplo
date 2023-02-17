package br.com.kikimvc.crudexemplo.modelo;

public class Conta {

        private Long id;
        private String descricao;
        private EnumTipoConta tipo;
        private Pessoa pessoa;

        public Long getId() {
            return id;
        }

        public void setId(Long id) {
            this.id = id;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public EnumTipoConta getTipo() {
            return tipo;
        }

        public void setTipo(EnumTipoConta tipo) {
            this.tipo = tipo;
        }

        public Pessoa getPessoa() {
            return pessoa;
        }

        public void setPessoa(Pessoa pessoa) {
            this.pessoa = pessoa;
        }
}
