package br.com.kikimvc.crudexemplo.modelo;

import java.util.Date;

public class Conta {

        private Long id;
        private String descricao;
        private EnumTipoConta tipo;
        private Pessoa pessoa;

        private Date dataPagamento;

        private Date dataVencimento;

        private Double valor;

        private Boolean pago;

        public Boolean getPago() {
            return pago;
        }

        public void setPago(Boolean pago) {
            this.pago = pago;
        }

        public Double getValor() {
            return valor;
        }

        public void setValor(Double valor) {
            this.valor = valor;
        }

        public void setDataVencimento(Date dataVencimento) {
            this.dataVencimento = dataVencimento;
        }

        public Date getDataVencimento() {
            return dataVencimento;
        }

        public Date getDataPagamento() {
            return dataPagamento;
        }

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
