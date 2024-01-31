import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class BankAccount {
    private int balance;

    public BankAccount(int initialBalance) {
        this.balance = initialBalance;
    }

    public int getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public boolean withdraw(int amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;  // Withdrawal successful
        } else {
            return false; // Insufficient balance
        }
    }
}

class ATM {
    private BankAccount bankAccount;

    public ATM(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void deposit(int amount) {
        bankAccount.deposit(amount);
    }

    public boolean withdraw(int amount) {
        return bankAccount.withdraw(amount);
    }

    public int checkBalance() {
        return bankAccount.getBalance();
    }
}

public class ATMGUI extends JFrame {

    private ATM atm;
    private JTextField amountField;
    private JTextArea resultArea;

    public ATMGUI(ATM atm) {
        this.atm = atm;

        setTitle("ATM Machine");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        createUI();
    }

    private void createUI() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        JLabel amountLabel = new JLabel(" Enter Amount: ");
        amountLabel.setFont(new Font("sans-serif",Font.BOLD,14));;
        amountField = new JTextField();
        amountField.setFont(new Font("sans-serif", Font.PLAIN, 15));

        JButton depositButton = new JButton("Deposit");
        JButton withdrawButton = new JButton("Withdraw");
        JButton balanceButton = new JButton("Check Balance");

        resultArea = new JTextArea();
        resultArea.setFont(new Font("sans-serif",Font.PLAIN,14));
        resultArea.setEditable(false); // can't make any change by the user

        // colors
        panel.setBackground(Color.LIGHT_GRAY);
        amountLabel.setForeground(Color.WHITE);
        amountField.setBackground(Color.WHITE);
        depositButton.setBackground(new Color(34, 139, 34)); // Green color
        withdrawButton.setBackground(new Color(255, 69, 0)); // Red-Orange color
        balanceButton.setBackground(new Color(70, 130, 180)); // Steel Blue color

        depositButton.setForeground(Color.WHITE);
        withdrawButton.setForeground(Color.WHITE);
        balanceButton.setForeground(Color.WHITE);

        // button details
        Font buttonFont = new Font("sans-serif", Font.BOLD, 14);
        depositButton.setFont(buttonFont);
        withdrawButton.setFont(buttonFont);
        balanceButton.setFont(buttonFont);

        depositButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        withdrawButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));
        balanceButton.setBorder(BorderFactory.createLineBorder(Color.WHITE, 2));

        // hover effect
        depositButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                depositButton.setBackground(new Color(0, 128, 0)); 
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                depositButton.setBackground(new Color(34, 139, 34)); 
            }
        });

        withdrawButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                withdrawButton.setBackground(new Color(255, 99, 71)); 
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                withdrawButton.setBackground(new Color(255, 69, 0)); 
            }
        });

        balanceButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                balanceButton.setBackground(new Color(100, 149, 237)); 
            }

            public void mouseExited(java.awt.event.MouseEvent evt) {
                balanceButton.setBackground(new Color(70, 130, 180)); 
            }
        });

        depositButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleDeposit();
            }
        });

        withdrawButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleWithdraw();
            }
        });

        balanceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                handleCheckBalance();
            }
        });

        panel.add(amountLabel);
        panel.add(amountField);
        panel.add(depositButton);
        panel.add(withdrawButton);
        panel.add(balanceButton);
        panel.add(resultArea);

        add(panel);
    }

    private void handleDeposit() {
        try {
            int amount = Integer.parseInt(amountField.getText());
            atm.deposit(amount);
            updateResult("Deposit successful😄.New balance: " + atm.checkBalance());
        } catch (NumberFormatException ex) {
            updateResult("Invalid input. Please enter a valid amount.");
        }
    }

    private void handleWithdraw() {
        try {
            int amount = Integer.parseInt(amountField.getText());
            boolean success = atm.withdraw(amount);

            if (success) {
                updateResult("Withdrawal successful😢. New balance: " + atm.checkBalance());
            } else {
                updateResult("Insufficient balance😂. Withdrawal failed.");
            }
        } catch (NumberFormatException ex) {
            updateResult("Invalid input. Please enter a valid amount.");
        }
    }

    private void handleCheckBalance() {
        int balance = atm.checkBalance();
        updateResult("Current balance: " + balance);
    }

    private void updateResult(String message) {
        resultArea.setText(message);
    }

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0);
        ATM atm = new ATM(bankAccount);

        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new ATMGUI(atm).setVisible(true);
            }
        });
    }
}
