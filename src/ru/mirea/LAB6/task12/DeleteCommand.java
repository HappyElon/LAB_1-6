package ru.mirea.LAB6.task12;

class DeleteCommand implements Command {
    private final int start;
    private final int end;
    private final String deletedText;

    public DeleteCommand(int start, int end, String deletedText) {
        this.start = start;
        this.end = end;
        this.deletedText = deletedText;
    }

    @Override
    public void execute(StringBuilder stringBuilder) {
        stringBuilder.delete(start, end);
    }
}