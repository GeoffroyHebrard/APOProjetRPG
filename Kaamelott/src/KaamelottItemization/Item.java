/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package KaamelottItemization;

/**
 *
 * @author nitnek
 */
public interface Item {
    public void equipItem(KaamelottCharacter.Character Character);
    public void dropItem(KaamelottCharacter.Character Character);
    public String getName();
    public int getValue();
    public boolean isEquiped();
    public String getCharac();
}

