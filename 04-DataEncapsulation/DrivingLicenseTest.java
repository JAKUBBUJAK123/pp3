public class DrivingLicenseTest {
    public static void main(String[] args) {
        DrivingLicense dl = new DrivingLicense();
        dl.setAdress("Okulickiego 246");
        dl.setName("jAKUB");
        dl.setCategory("B");
        dl.setCity("Kraków");
        dl.setLicensenumber(89012809);
        dl.setPostalCode("32-800");
        dl.setSurname("Bujak");
        dl.setYearOfIssue(2021);
        dl.getAdress();
        dl.getCategory();
        dl.getCity();
        dl.getLicensenumber();
        dl.getName();
        dl.getPostalCode();
        dl.getSurname();
        dl.getYearOfIssue();
        System.out.println(dl.toString());
    }
}
