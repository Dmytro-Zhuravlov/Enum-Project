public enum StopWords {
    SPRING("Spring"),
    END("end");

    String stopWord;

    StopWords(String stopWord) {
        this.stopWord = stopWord;
    }

    public String getStopWord() {
        return stopWord;
    }
}
