package snapShot;
import java.rmi.*;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.ArrayList;
import snapShot.snapShot_Client;

public interface snapShot_Interface extends Remote {
	public ArrayList<Integer> check() throws RemoteException;
	public int register(int id) throws RemoteException;
	public boolean startedTransaction() throws RemoteException;
	public int getBalance() throws RemoteException;
	public void received(int amount) throws RemoteException;
	public void sent(int amount) throws RemoteException;
	public void startT(int id) throws RemoteException;
	public void startSnap(int id) throws RemoteException;
	public void regSeq(ArrayList<ArrayList<Integer>> seqNumber) throws RemoteException;
	public void regCheckOnLink(ArrayList<ArrayList<Integer>> checkMonyOnLink) throws RemoteException;
	public ArrayList<ArrayList<Integer>> getSeq() throws RemoteException;
	public ArrayList<ArrayList<Integer>> getCheckOnLink() throws RemoteException;
	public int sendAndReceive(int id, int hostID, int amount, int seqNum, String transaction) throws RemoteException;
	public void setSnap(boolean snapOn) throws RemoteException;
	public boolean checkSnap() throws RemoteException;
	public int getSnapId() throws RemoteException;	
	public void setSnapId(int snapId) throws RemoteException;
	public int getSnapTotal() throws RemoteException;
}
