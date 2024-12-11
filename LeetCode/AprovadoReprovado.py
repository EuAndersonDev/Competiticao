p1, p2 = map(float, input().split())


media = (p1 + p2) / 2;

if media >= 7.0:
    print("Aprovado")
elif media >= 4.0:
    print("Recuperacao")
else:
    print("Reprovado")    
