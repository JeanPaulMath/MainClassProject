public abstract class Product implements Item {

    private int id;
    private String type;
    private String manufacturer;
    private String name;

    enum Type{ Audio, visual, AudioMobile, VisualMobile;}
    enum Code{AU,VI,AM,VM;}

    public Product(String prodName){
        this.name = prodName;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    @Override
    public String toString() {
        return "type:'" + type + '\'' + ", manufacturer:'" + manufacturer + '\'' + ", name:'" + name + '\'' ;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String getManufacturer() {
        return manufacturer;
    }

    @Override
    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}
