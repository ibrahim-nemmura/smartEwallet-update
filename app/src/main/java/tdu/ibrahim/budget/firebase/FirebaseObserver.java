package tdu.ibrahim.budget.firebase;


public interface FirebaseObserver<T> {
    void onChanged(T t);
}
