package Work12;

import java.io.Serializable;

public class PostitAnswer implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -1951363333305017598L;
	private String status;
	private boolean success;
	private String message;
	private int message_code;
	private int Total;
	private PostitData[] data;
	
	
	
	
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public boolean isSuccess() {
		return success;
	}
	public void setSuccess(boolean success) {
		this.success = success;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public int getMessage_code() {
		return message_code;
	}
	public void setMessage_code(int message_code) {
		this.message_code = message_code;
	}
	public int getTotal() {
		return Total;
	}
	public void setTotal(int total) {
		Total = total;
	}
	public PostitData[] getData() {
		return data;
	}
	public void setData(PostitData[] data) {
		this.data = data;
	}

	
	
}
