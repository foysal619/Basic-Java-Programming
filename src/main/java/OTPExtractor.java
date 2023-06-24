// 19. Extract the OTP from the SMS. "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S"

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OTPExtractor {
        private static final Pattern OTP_PATTERN = Pattern.compile("Your one time password is (.{6})");

        public static String extractOTP(String sms) {
            Matcher matcher = OTP_PATTERN.matcher(sms);
            if (matcher.find()) {
                return matcher.group(1);
            } else {
                return null;
            }
        }

        public static void main(String[] args) {
            String sms = "Your one time password is 246148. Don't share this code with anyone \r\nBvwt3f8js2S";
            String otp = extractOTP(sms);
            System.out.println("Your Desired OTP extracted from SMS: " + otp);
        }
    }

