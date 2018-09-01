package six;

/**
 * java 对象的浅克隆
 *
 * 条件：java对象的成员变量是基本类型
 */

public class Address implements Cloneable {
    private String state;
    private String provinces;
    private String city;

    public Address(String state, String provinces, String city) {
        this.state = state;
        this.provinces = provinces;
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getProvinces() {
        return provinces;
    }

    public void setProvinces(String provinces) {
        this.provinces = provinces;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append("国家："+state+"， ");
        stringBuilder.append("省份："+provinces+"， ");
        stringBuilder.append("城市："+city);
        return stringBuilder.toString();
    }


    /**
     * address类的域不是基本类型就是不可变类型，所以可以直接用浅克隆
     * @return
     */
    @Override
    public Address clone(){
        Address address=null;
        try{
            address= (Address) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return address;
    }
}
