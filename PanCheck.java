class PanCheck {
    public static void main(String[] args) {
        String pan = args[0];
        try {
            panCheck(pan);
        } catch (PanException e) {
            System.out.println(e.getMessage());
        }
    }

    static void panCheck(String pan) throws PanException {
        if (pan.length() != 10) {
            throw new PanException("Invalid PAN");
        }

        for (int i = 0; i < 5; i++) {
            if (!Character.isLetter(pan.charAt(i))) {
                throw new PanException("Invalid PAN");
            }
        }

        for (int i = 5; i < 9; i++) {
            if (!Character.isDigit(pan.charAt(i))) {
                throw new PanException("Invalid PAN");
            }
        }

        if (!Character.isLetter(pan.charAt(9))) {
            throw new PanException("Invalid PAN");
        }
        System.out.println("Valid PAN");
    }
}

class PanException extends Exception {
    PanException(String message) {
        super(message);
    }
}
