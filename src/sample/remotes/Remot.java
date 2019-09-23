package sample.remotes;

import java.util.List;

public interface Remot<T> {

	public abstract void create(T t);

	public abstract T find(int idc);

	public abstract List<T> get();

	public abstract void update(T t);

	public abstract void delete(int idc);

}