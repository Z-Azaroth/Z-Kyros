import tkinter as tk
from tkinter import ttk
from PIL import Image, ImageTk
def main():
    #Create all the variables
    window = tk.Tk()
    button = ttk.Button()
    photo = ImageTk.PhotoImage(Image.open("./assets/Icon.png"))
    #Window Configuration
    window.geometry("1080x600+200+150")
    window.title("Kyros")
    window.iconphoto(True, photo)


    #Button Configuration

    #Send the elements to the window
    button.pack()
    window.mainloop()
main()
