package br.com.siteBaristaMaster.model;

public class Produto {
    private String codigoProduto; //0
    private String nomeProduto; //1
    private String categoriaProduto; //2
    private double precoVenda;//3
    private String image;//4
    private String descritivo; //5

    public Produto(String codigoProduto, String nomeProduto, String categoriaProduto, double precoVenda, String image, String descritivo) {
        this.codigoProduto = codigoProduto; //0
        this.nomeProduto = nomeProduto; // 1
        this.categoriaProduto = categoriaProduto; // 2
        this.precoVenda = precoVenda; // 3
        this.image = image;//4
        this.descritivo = descritivo; // 5

    }

    public String getCodigoProduto() {
        return codigoProduto;
    }



    public String getCategoriaProduto() {
        return categoriaProduto;
    }




    public String getDescritivo() {
        return descritivo;
    }




    public double getPrecoVenda() {
        return precoVenda;
    }



    public String getImage() {
        return image;
    }





    public String getNomeProduto() {
        return nomeProduto;
    }




}
