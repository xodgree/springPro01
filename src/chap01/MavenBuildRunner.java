package chap01;

import java.util.List;

public class MavenBuildRunner implements BuildRunner{
	private String mavenPath;

	@Override
	public void build(List<String> srcDirs, String binDir) {
		// TODO Auto-generated method stub
		String info = "���̺� ���: " + mavenPath +"\n";
		for(String srcDir : srcDirs)
			info += "�ҽ����: " + srcDir + "\n";
		info += "Ŭ�������� ���: " + binDir + "\n";
		System.out.printf("MavenBuildRunner.build() ���� \n%s", info);
	 }
	public void setMavenPath(String mavenPath) {
		this.mavenPath = mavenPath;
	}
	
}
