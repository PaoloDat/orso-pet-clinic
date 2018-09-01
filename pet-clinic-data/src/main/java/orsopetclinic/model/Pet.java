package orsopetclinic.model;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Class description.
 *
 * @author Pavel Datunashvili 01.09.2018
 */

@Getter
@Setter
public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birhDate;
}
