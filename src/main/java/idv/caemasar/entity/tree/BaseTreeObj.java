package idv.caemasar.entity.tree;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * 描述：基层树形结构实体类
 */
public class BaseTreeObj<E, ID extends Serializable> implements Serializable {
	private static final long serialVersionUID = 1L;
	private ID id;
	private ID parentId;
	private List<E> childsList = new ArrayList<E>();

	public ID getId() {
		return id;
	}

	public void setId(ID id) {
		this.id = id;
	}

	public ID getParentId() {
		return parentId;
	}

	public void setParentId(ID parentId) {
		this.parentId = parentId;
	}

	public List<E> getChildsList() {
		return childsList;
	}

	public void setChildsList(List<E> childsList) {
		this.childsList = childsList;
	}
}