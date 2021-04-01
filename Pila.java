import java.io.*;
import java.util.NoSuchElementException;
import java.util.Iterator;

public class Pila<T> implements Iterable<T> {
  private Node<T> primero;
  private int numeroElementos;


  public boolean isVacio(){
    return primero == null;
  }

  public int tamano(){
    return numeroElementos;
  }

  public void push(T elemento){
    Node<T> segundo = primero;
    primero = new Node<T>();
    primero.setItem(elemento);
    primero.setSiguiente(segundo);
    numeroElementos++;
  }

  public T pop(){
    if(isVacio()){
      throw new NoSuchElementException("No quedan elementos en la pila");
    }else {
      T elements = primero.getItem();
      primero = primero.getSiguiente();
      numeroElementos--;
      return elemento;
    }
  }

  public T peek(){
    if(isVacio()){
      throw new NoSuchElementException("No hay elementos en la pila");
    }
    return primero.getItem();
  }

  public String toString(){
    StringBuilder stringBuilder = new StringBuilder();
    for(T elements: this){
        stringBuilder.append(elements).append(' ');
    }
    return stringBuilder.toString();
  }

  public Iterator<T> iterator(){
    return new IteratorEnlazado<>(primero);
  }
}
