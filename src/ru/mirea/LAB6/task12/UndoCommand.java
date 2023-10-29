package ru.mirea.LAB6.task12;

class UndoCommand implements Command {
    private final Command previousCommand;

    public UndoCommand(Command previousCommand) {
        this.previousCommand = previousCommand;
    }

    @Override
    public void execute(StringBuilder stringBuilder) {
        previousCommand.execute(stringBuilder);
    }
}