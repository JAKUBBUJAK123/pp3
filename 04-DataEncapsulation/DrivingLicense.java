public class DrivingLicense {
    private String name;
    private String surname;
    private String adress;
    private String postalCode;
    private String city;
    private int licensenumber;
    private int yearOfIssue;
    private String category;

    

    public String getName() {
        return name;
    }



    public void setName(String name) {
        String trueName = name.substring(0,1).toUpperCase() + name.substring(1).toLowerCase();
        
        this.name = trueName;
    }



    public String getSurname() {
        return surname;
    }



    public void setSurname(String surname) {
        this.surname = surname;
    }



    public String getAdress() {
        return adress;
    }



    public void setAdress(String adress) {
        this.adress = adress;
    }



    public String getPostalCode() {
        return postalCode;
    }



    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }



    public String getCity() {
        return city;
    }



    public void setCity(String city) {
        this.city = city;
    }



    public int getLicensenumber() {
        return licensenumber;
    }



    public void setLicensenumber(int licensenumber) {
        this.licensenumber = licensenumber;
    }



    public int getYearOfIssue() {
        return yearOfIssue;
    }



    public void setYearOfIssue(int yearOfIssue) {
        if(yearOfIssue >=1980 && yearOfIssue <=2023){
        this.yearOfIssue = yearOfIssue;
        }
    }



    public String getCategory() {
        return category;
    }



    public void setCategory(String category) {
        this.category = category;
    }

    

    @Override
    public String toString() {
        return "DrivingLicense [name=" + name + ", surname=" + surname + ", adress=" + adress + ", postalCode="
                + postalCode + ", city=" + city + ", licensenumber=" + licensenumber + ", yearOfIssue=" + yearOfIssue
                + ", category=" + category + "]";
    }



    public void display(){
        System.out.printf("%s,%s,%s,%s,%s,%d,%d,%s",name,surname,adress,postalCode,city,licensenumber,yearOfIssue,category);
    }
}


