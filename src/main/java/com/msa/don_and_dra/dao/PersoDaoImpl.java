package com.msa.don_and_dra.dao;
import com.msa.don_and_dra.model.Perso;
import org.springframework.stereotype.Repository;
import java.util.ArrayList;
import java.util.List;

@Repository
public class PersoDaoImpl implements PersoDao{


    private static Object newArrayList;
    public static List<Perso> persos=new ArrayList<>();
    static{
        persos.add(new Perso(1, new String("Toi"), new String("Mage")));
        persos.add(new Perso(2, new String("Il"), new String("Mage")));
        persos.add(new Perso(3, new String("Nous"), new String("Guerrier")));
    }

    @Override
    public Perso PersofindById (int id) {
        for (Perso perso : persos){
            if (perso.getId() == id){
                return perso;
            }
        }
        return null;
    }
    @Override
    public void Persosave(Perso perso) {
        persos.add(perso);
    }

    @Override
    public List<Perso> findAll() {
        return persos;
    }

}
