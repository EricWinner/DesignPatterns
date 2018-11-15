package com.design.pattern.command;

public class CommandMode {

    public static void main(String[] args) {
        CommandMode commandMode = new CommandMode();
        // 构造一个接受者对象
        Receiver receiver = commandMode.new Receiver();
        // 根据接收者对象构造一个命令对象
        Command command = commandMode.new ConcreateCommand(receiver);
        // 根据具体的对象构造请求者对象
        Invoker invoker = commandMode.new Invoker(command);
        // 执行请求方法
        invoker.action();
    }

    /**
     * 接收者
     * @author EdwardAdmin
     *
     */
    private class Receiver {

        public void action() {
            System.out.println("执行具体操作");
        }
    }

    /**
     * 命令
     * @author EdwardAdmin
     *
     */
    private interface Command {
        void execute();
    }

    /**
     * 具体命令
     * @author EdwardAdmin
     *
     */
    public class ConcreateCommand implements Command {

        private Receiver mReceiver;

        public ConcreateCommand(Receiver receiver) {
            this.mReceiver = receiver;
        }

        @Override
        public void execute() {
            mReceiver.action();
        }

    }

    /**
     * 调用者
     * @author EdwardAdmin
     *
     */
    public class Invoker {
        private Command mCommand;

        public Invoker(Command command) {
            this.mCommand = command;
        }

        public void action() {
            mCommand.execute();
        }
    }
}
