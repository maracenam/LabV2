import java.io.*;

public class Node<T> {


  private T item;
  private Node<T> siguiente;

  public T getItem(){
    return item;
  }

  public Node<T> getSiguiente() {
    return siguiente;
  }

  public void  setItem(T item){
    this.item = item;
  }

  public void setSiguiente(Node<T> siguiente){
    this.siguiente = siguiente;
  }

}
