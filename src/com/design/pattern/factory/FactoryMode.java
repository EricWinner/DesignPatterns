package com.design.pattern.factory;

public class FactoryMode {

    public static void main(String[] args) {
        FactoryMode mode = new FactoryMode();

        IFactory factory = mode.new AddFactory();
        Operation operation = factory.createOperation();
        operation.numberA = 10;
        operation.numberB = 20;

        float result = operation.getResult();
        System.out.println("Result = " + result);
    }

    interface IFactory {
        Operation createOperation();
    }

    class AddFactory implements IFactory {

        @Override
        public Operation createOperation() {
            return new OperationAdd();
        }
    }

    class SubFactory implements IFactory {

        @Override
        public Operation createOperation() {
            return new OperationSub();
        }
    }

    class MulFactory implements IFactory {

        @Override
        public Operation createOperation() {
            return new OperationMul();
        }
    }

    class DivFactory implements IFactory {

        @Override
        public Operation createOperation() {
            return new OperationDiv();
        }
    }

    public class Operation {
        protected float numberA = 0.0f;
        protected float numberB = 0.0f;

        protected float getResult() {
            float result = 0;
            return result;
        }
    }

    public class OperationAdd extends Operation {

        @Override
        protected float getResult() {
            float result = 0;
            result = numberA + numberB;
            return result;
        }

    }

    public class OperationSub extends Operation {
        @Override
        protected float getResult() {
            float result = 0;
            result = numberA - numberB;
            return result;
        }
    }

    public class OperationMul extends Operation {
        @Override
        protected float getResult() {
            float result = 0;
            result = numberA * numberB;
            return result;
        }
    }

    public class OperationDiv extends Operation {
        @Override
        protected float getResult() {
            float result = 0;
            result = numberA / numberB;
            return result;
        }
    }
}
