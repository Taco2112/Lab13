public abstract interface ITUNES
{
  //iPod Manager (lINES 4 through 9)
	public abstract void isSyncingIPOD();
	public abstract void EjectIPOD();
	public abstract void newiPod();
  public abstract void RESETiPod();
  public abstract void restoreIPODosIPC();
  public abstract void fileCheckeriPod();
  //iPhone Manager (LINES 11 through 16)
  public abstract void isSyncingIPHONE();
	public abstract void EjectIPHONE();
	public abstract void newiPhone();
  public abstract void RESETiPhone();
  public abstract void restoreIOSiPhone();
  public abstract void fileCheckeriPhone();
 // iPad Manager (LINES 17 through 22)
 public abstract void isSyncingIPAD();
 public abstract void EjectIPAD();
 public abstract void newiPad();
 public abstract void RESETiPad();
 public abstract void restoreIOSiPad();
 public abstract void fileCheckeriPad();



}
