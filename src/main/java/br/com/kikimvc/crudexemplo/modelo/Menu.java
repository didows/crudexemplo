package br.com.kikimvc.crudexemplo.modelo;

public class Menu {

            private Long id;
            private String descricao;
            private String url;
            private String icone;
            private Menu menuPai;

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

            public String getUrl() {
                return url;
            }

            public void setUrl(String url) {
                this.url = url;
            }

            public String getIcone() {
                return icone;
            }

            public void setIcone(String icone) {
                this.icone = icone;
            }

            public Menu getMenuPai() {
                return menuPai;
            }

            public void setMenuPai(Menu menuPai) {
                this.menuPai = menuPai;
            }
}
