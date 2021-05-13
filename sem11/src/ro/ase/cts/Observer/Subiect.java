package ro.ase.cts.Observer;

public interface Subiect {
void aboneazaClient(Observer observer);
void trimiteMesaj(String mesaj);
void deazaboneazaClient(Observer observer);
}
