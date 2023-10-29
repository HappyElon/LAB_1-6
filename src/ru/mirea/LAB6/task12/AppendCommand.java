package ru.mirea.LAB6.task12;

class AppendCommand implements Command {
    private final String textToAppend;

    public AppendCommand(String textToAppend) {
        this.textToAppend = textToAppend;
    }

    @Override
    public void execute(StringBuilder stringBuilder) {
        stringBuilder.append(textToAppend);
    }
}