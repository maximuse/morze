package hu.nyirszikszi;

class MorseABC {
    private char letter;
    private String signal;

    MorseABC(char letter, String signal) {
        this.letter = letter;
        this.signal = signal;
    }

    char getLetter() {
        return letter;
    }

    String getSignal() {
        return signal;
    }

    @Override
    public String toString() {
        return "MorseABC{" +
                "letter=" + letter +
                ", signal='" + signal + '\'' +
                '}';
    }
}