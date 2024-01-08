package net.codejava;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Sale {
	
	private int id;
	private String item;
	private int quantity;
	private float amount;
}
