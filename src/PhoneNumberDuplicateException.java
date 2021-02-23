public class PhoneNumberDuplicateException extends RuntimeException {
    private final String phoneNumber;

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public PhoneNumberDuplicateException(String message, String phoneNumber) {
        super(message);
        this.phoneNumber = phoneNumber;
    }
}
