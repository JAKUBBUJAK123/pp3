public class file {
    private int size;
    private String name;
    public int getSize() {
        return size;
    }
    public void setSize(int size) {
        this.size = size;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public file(int size, String name) {
        this.size = size;
        this.name = name;
    }
    public void copyFile(){
        System.out.println("File copied");
    }
}
