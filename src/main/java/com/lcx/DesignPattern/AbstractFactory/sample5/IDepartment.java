package com.lcx.DesignPattern.AbstractFactory.sample5;

public interface IDepartment {
	public abstract void insert(Department department);
	public abstract Department select(Integer id);
}
