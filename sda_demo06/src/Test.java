// A Simple Java program to show working of user defined 
// Generic classes with varargs

class Test<T>
{
    // An object of type T is declared
    T obj;
    Test(T ...obj){
        System.out.println("Number of arguments: " + obj.length);

        for (T i: obj)
            System.out.print(i + " ");
        System.out.println();
    }

    public T getObject()  {
        return this.obj;
    }

    @Override
    public String toString() {
        return "Test{" +
                "obj=" + obj +
                '}';
    }
}

