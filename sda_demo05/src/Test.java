// A Simple Java program to show working of user defined 
// Generic classes 

// We use < > to specify Parameter type 
class Test<T>
{
    // An object of type T is declared
    T obj;
    Test(T obj) {
        this.obj = obj;
    }

    Test(){
    }

    public T getObject()  {
        return this.obj;
    }

    public static <T> void printObject(T v1){
        for(int i = 0; i < 10; i++){
            System.out.println(v1);
        }
    }

    public boolean isNull(){

        if (obj == null){
            return true;
        }
        else return false;
    }

    @Override
    public String toString() {
        return "Test{" +
                "obj=" + obj +
                '}';
    }
}

