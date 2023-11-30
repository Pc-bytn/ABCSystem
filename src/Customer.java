import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Customer implements DbActions {
    private String id;
    private String name;
    private String email;
    private String address;
    private String contactNumber;
    private String dateOfBirth;
    private String gender;

    public Customer(String id, String name, String email, String address, String contactNumber, String dateOfBirth, String gender) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.contactNumber = contactNumber;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }
    public Customer() {}


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void select() {

    }

    @Override
    public void add() {

        String query = "INSERT INTO `customer`(`cusName`, `cusEmail`, `cusAddress`, `cusNumber`, `cusDOB`, `cusGender`) " +
                "VALUES (?,?,?,?,?,?)";

        PreparedStatement preparedStatement = null;
        Connection con = null;
        try {
            con = DbConnect.connect();
            assert con != null;
            preparedStatement = con.prepareStatement(query);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, address);
            preparedStatement.setString(4, contactNumber);
            preparedStatement.setString(5, dateOfBirth);
            preparedStatement.setString(6, gender);
            preparedStatement.executeUpdate();
            preparedStatement.close();
            con.close();
            System.out.println();
            System.out.println("Customer Registered Successfully.");
        } catch (SQLException e) {
            System.out.println("This Error is generated while adding the customer to the database.");
            System.out.println("Error is : " + e.getMessage());
        }

    }

    @Override
    public void update() {

    }

    @Override
    public void delete() {

    }
}
