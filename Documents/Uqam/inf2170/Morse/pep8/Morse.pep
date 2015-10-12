while: nop0 ; tant que le symbol saisi est différent du code ascii qui correspond à $.
ldbytea '$', i
cpa symbol, d
breq fin

lda 0,i; initialisation des symboles a 0.
sta compteur,d
sta symbAdd, d

while2: nop0 ;boucle qui s'exécute tant que le caractère 
             ;saisis est différent du caractère espace ou 
             ;du caractère retour chariot


fin: stop
symbol: .word '$' 
symbAdd: .word 0
compteur: .word 0
indice0: .block 1
indice1: .block 1
indice2: .block 1
indice3: .block 1
.end