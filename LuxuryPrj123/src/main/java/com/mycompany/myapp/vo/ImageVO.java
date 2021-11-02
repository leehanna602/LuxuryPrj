package com.mycompany.myapp.vo;

import java.util.Arrays;

public class ImageVO {
	private int imageId;
	private int imageItemId;
	private byte[] imageFile;
	
	public ImageVO() {
		super();
	}
	public int getImageId() {
		return imageId;
	}
	public void setImageId(int imageId) {
		this.imageId = imageId;
	}
	public int getImageItemId() {
		return imageItemId;
	}
	public void setImageItemId(int imageItemId) {
		this.imageItemId = imageItemId;
	}
	public byte[] getImageFile() {
		return imageFile;
	}
	public void setImageFile(byte[] imageFile) {
		this.imageFile = imageFile;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(imageFile);
		result = prime * result + imageId;
		result = prime * result + imageItemId;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ImageVO other = (ImageVO) obj;
		if (!Arrays.equals(imageFile, other.imageFile))
			return false;
		if (imageId != other.imageId)
			return false;
		if (imageItemId != other.imageItemId)
			return false;
		return true;
	}
	
	
}
