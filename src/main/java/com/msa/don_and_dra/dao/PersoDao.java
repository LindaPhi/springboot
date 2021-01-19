package com.msa.don_and_dra.dao;
import com.msa.don_and_dra.model.Perso;
import java.util.List;

public interface PersoDao {
    public List<Perso>findAll();
    public Perso PersofindById(int id);
    public void Persosave(Perso perso);
}
