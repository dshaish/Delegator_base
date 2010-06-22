package org.domain.delegator.entity;

// Generated 00:56:58 13/09/2009 by Hibernate Tools 3.2.4.GA

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;
import org.hibernate.validator.NotNull;

/**
 * TasksC generated by hbm2java
 */
@Entity
@Table(name = "tasks_c", catalog = "dropdb")
public class TasksC implements java.io.Serializable {

	private int tid;
	private Tasks tasksByTid;
	private Tasks tasksByParentTaskId;
	private Tasks tasksByRootTaskId;
	private Integer parallel;

	public TasksC() {
	}

	public TasksC(Tasks tasksByTid, Tasks tasksByParentTaskId,
			Tasks tasksByRootTaskId) {
		this.tasksByTid = tasksByTid;
		this.tasksByParentTaskId = tasksByParentTaskId;
		this.tasksByRootTaskId = tasksByRootTaskId;
	}

	public TasksC(Tasks tasksByTid, Tasks tasksByParentTaskId,
			Tasks tasksByRootTaskId, Integer parallel) {
		this.tasksByTid = tasksByTid;
		this.tasksByParentTaskId = tasksByParentTaskId;
		this.tasksByRootTaskId = tasksByRootTaskId;
		this.parallel = parallel;
	}

	@GenericGenerator(name = "generator", strategy = "foreign", parameters = @Parameter(name = "property", value = "tasksByTid"))
	@Id
	@GeneratedValue(generator = "generator")
	@Column(name = "Tid", unique = true, nullable = false)
	public int getTid() {
		return this.tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	@OneToOne(fetch = FetchType.LAZY)
	@PrimaryKeyJoinColumn
	@NotNull
	public Tasks getTasksByTid() {
		return this.tasksByTid;
	}

	public void setTasksByTid(Tasks tasksByTid) {
		this.tasksByTid = tasksByTid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ParentTaskId", nullable = false)
	@NotNull
	public Tasks getTasksByParentTaskId() {
		return this.tasksByParentTaskId;
	}

	public void setTasksByParentTaskId(Tasks tasksByParentTaskId) {
		this.tasksByParentTaskId = tasksByParentTaskId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "RootTaskId", nullable = false)
	@NotNull
	public Tasks getTasksByRootTaskId() {
		return this.tasksByRootTaskId;
	}

	public void setTasksByRootTaskId(Tasks tasksByRootTaskId) {
		this.tasksByRootTaskId = tasksByRootTaskId;
	}

	@Column(name = "Parallel")
	public Integer getParallel() {
		return this.parallel;
	}

	public void setParallel(Integer parallel) {
		this.parallel = parallel;
	}

}