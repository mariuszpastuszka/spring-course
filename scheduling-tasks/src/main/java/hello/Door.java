package hello;

import java.util.Optional;

public class Door {

    Lock lock;

    public Door(Lock lock) {
        this.lock = lock;
    }

    public Optional<Lock> getLock() {
        return Optional.ofNullable(lock);
    }


}
