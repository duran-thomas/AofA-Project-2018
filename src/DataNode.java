
public class DataNode {
	
	private Module data;
	private DataNode link;
	
	public DataNode() {
		data = null;
		link = null;
	}
	
	public DataNode(Module data, DataNode link) {
		super();
		this.data = data;
		this.link = link;
	}
	
	public DataNode(Module data){
		this.data = data;
		link = null;
	}

	public Module getData() {
		return data;
	}

	public void setData(Module data) {
		this.data = data;
	}

	public DataNode getLink() {
		return link;
	}

	public void setLink(DataNode link) {
		this.link = link;
	}

	@Override
	public String toString() {
		return "DataNode [data=" + data + ", link=" + link + "]";
	}
	
	public void Display() {
		System.out.println(toString());
	}

}
