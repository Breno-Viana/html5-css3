import customtkinter as ctk



def validar_login():
    senha = campoSenha.get()
    usu = campoUsuario.get()
    
    if usu == 'jao' and senha == '1234':
        feedback.configure(text='login efeituado',text_color='green')    
    else:
        feedback.configure(text='errado', text_color='red') 
        
        
          

ctk.set_appearance_mode('dark')
app = ctk.CTk()
app.title('Sistema de Login')
app.geometry('400x300')

label = ctk.CTkLabel(app,text='Usuario')
label.pack(pady = 10)
campoUsuario= ctk.CTkEntry(app,placeholder_text='Digite Seu Usuario')
campoUsuario.pack(pady=10)

labelSenha = ctk.CTkLabel(app, text='Senha')
labelSenha.pack(pady=10)
campoSenha = ctk.CTkEntry(app,placeholder_text='Digite Sua Senha',show='*')
campoSenha.pack(pady=10)

button = ctk.CTkButton(app,text='Login',command=validar_login)
button.pack(pady=10)

feedback = ctk.CTkLabel(app,text='')
feedback.pack(pady=5)



app.mainloop()