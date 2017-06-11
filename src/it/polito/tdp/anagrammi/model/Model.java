package it.polito.tdp.anagrammi.model;

import java.util.*;

import org.apache.commons.lang3.StringUtils;

import it.polito.tdp.anagrammi.db.ParolaDAO;

public class Model {

	ParolaDAO dao;
	private Map<Character,Integer> occorrenze;
	int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;
	List<Parola> lista;
	
	public Model(){
		dao=new ParolaDAO();
		occorrenze=new LinkedHashMap<Character,Integer>();
		occorrenze.put('a', 0);
		occorrenze.put('b', 0);
		occorrenze.put('c', 0);
		occorrenze.put('d', 0);
		occorrenze.put('e', 0);
		occorrenze.put('f', 0);
		occorrenze.put('g', 0);
		occorrenze.put('h', 0);
		occorrenze.put('i', 0);
		occorrenze.put('j', 0);
		occorrenze.put('k', 0);
		occorrenze.put('l', 0);
		occorrenze.put('m', 0);
		occorrenze.put('n', 0);
		occorrenze.put('o', 0);
		occorrenze.put('p', 0);
		occorrenze.put('q', 0);
		occorrenze.put('r', 0);
		occorrenze.put('s', 0);
		occorrenze.put('t', 0);
		occorrenze.put('u', 0);
		occorrenze.put('v', 0);
		occorrenze.put('w', 0);
		occorrenze.put('x', 0);
		occorrenze.put('y', 0);
		occorrenze.put('z', 0);
	}
	
	public Map<Character,Integer> getOccorrenze(){
		return occorrenze;
	}
	
	public int cercaParole(String input) {
		lista=new ArrayList<Parola>();
		lista=dao.getParoleIdonee(input);
		int numParole=lista.size();
		
		int numLettere=0;
		for(Parola parola: lista){
			numLettere+=parola.getNome().length();
			if(parola.getNome().contains("a")){
				a+=StringUtils.countMatches(parola.getNome(), "a");
			}
			if(parola.getNome().contains("b")){
				b+=StringUtils.countMatches(parola.getNome(), "b");
			}
			if(parola.getNome().contains("c")){
				c+=StringUtils.countMatches(parola.getNome(), "c");
			}
			if(parola.getNome().contains("d")){
				d+=StringUtils.countMatches(parola.getNome(), "d");
			}
			if(parola.getNome().contains("e")){
				e+=StringUtils.countMatches(parola.getNome(), "e");
			}
			if(parola.getNome().contains("f")){
				f+=StringUtils.countMatches(parola.getNome(), "f");
			}
			if(parola.getNome().contains("g")){
				g+=StringUtils.countMatches(parola.getNome(), "g");
			}
			if(parola.getNome().contains("h")){
				h+=StringUtils.countMatches(parola.getNome(), "h");
			}
			if(parola.getNome().contains("i")){
				i+=StringUtils.countMatches(parola.getNome(), "i");
			}
			if(parola.getNome().contains("j")){
				j+=StringUtils.countMatches(parola.getNome(), "j");
			}
			if(parola.getNome().contains("k")){
				k+=StringUtils.countMatches(parola.getNome(), "k");
			}
			if(parola.getNome().contains("l")){
				l+=StringUtils.countMatches(parola.getNome(), "l");
			}
			if(parola.getNome().contains("m")){
				m+=StringUtils.countMatches(parola.getNome(), "m");
			}
			if(parola.getNome().contains("n")){
				n+=StringUtils.countMatches(parola.getNome(), "n");
			}
			if(parola.getNome().contains("o")){
				o+=StringUtils.countMatches(parola.getNome(), "o");
			}
			if(parola.getNome().contains("p")){
				p+=StringUtils.countMatches(parola.getNome(), "p");
			}
			if(parola.getNome().contains("q")){
				q+=StringUtils.countMatches(parola.getNome(), "q");
			}
			if(parola.getNome().contains("r")){
				r+=StringUtils.countMatches(parola.getNome(), "r");
			}
			if(parola.getNome().contains("s")){
				s+=StringUtils.countMatches(parola.getNome(), "s");
			}
			if(parola.getNome().contains("t")){
				r+=StringUtils.countMatches(parola.getNome(), "t");
			}
			if(parola.getNome().contains("u")){
				u+=StringUtils.countMatches(parola.getNome(), "u");
			}
			if(parola.getNome().contains("v")){
				v+=StringUtils.countMatches(parola.getNome(), "v");
			}
			if(parola.getNome().contains("w")){
				w+=StringUtils.countMatches(parola.getNome(), "w");
			}
			if(parola.getNome().contains("x")){
				x+=StringUtils.countMatches(parola.getNome(), "x");
			}
			if(parola.getNome().contains("y")){
				y+=StringUtils.countMatches(parola.getNome(), "y");
			}
			if(parola.getNome().contains("z")){
				z+=StringUtils.countMatches(parola.getNome(), "z");
			}
		}
		occorrenze.put('a', a*100/numLettere);
		occorrenze.put('b', b*100/numLettere);
		occorrenze.put('c', c*100/numLettere);
		occorrenze.put('d', d*100/numLettere);
		occorrenze.put('e', e*100/numLettere);
		occorrenze.put('f', f*100/numLettere);
		occorrenze.put('g', g*100/numLettere);
		occorrenze.put('h', h*100/numLettere);
		occorrenze.put('i', i*100/numLettere);
		occorrenze.put('j', j*100/numLettere);
		occorrenze.put('k', k*100/numLettere);
		occorrenze.put('l', l*100/numLettere);
		occorrenze.put('m', m*100/numLettere);
		occorrenze.put('n', n*100/numLettere);
		occorrenze.put('o', o*100/numLettere);
		occorrenze.put('p', p*100/numLettere);
		occorrenze.put('q', q*100/numLettere);
		occorrenze.put('r', r*100/numLettere);
		occorrenze.put('s', s*100/numLettere);
		occorrenze.put('t', t*100/numLettere);
		occorrenze.put('u', u*100/numLettere);
		occorrenze.put('v', v*100/numLettere);
		occorrenze.put('w', w*100/numLettere);
		occorrenze.put('x', x*100/numLettere);
		occorrenze.put('y', y*100/numLettere);
		occorrenze.put('z', z*100/numLettere);
		return numParole;
	}
	
	public List<Parola> cercaAnagrammi(String input){
		List<Parola> anagrammi=new ArrayList<Parola>();
		List<String> lettere=new ArrayList<String>();
		
		for(int i=0;i<input.length(); i++){
			lettere.add(input.substring(i,i+1));
		}
		boolean err=false;
		for(Parola p: dao.getParole()){
			err=false;
			List<String> split=new ArrayList<String>();
			for(int i=0;i<p.getNome().length(); i++){
				split.add(p.getNome().substring(i,i+1));
			}
			for(int i=0;i<split.size() && !err;i++){
				int count=0;
				for(int j=0;j<lettere.size();j++){
					if(split.get(i).compareTo(lettere.get(j))==0){
						count++;
					}
				}
				if(count==0)
					err=true;
			}
			if(!err){
				anagrammi.add(p);
			}
		}
		return anagrammi;
	}

}
